package net.codeer.app.todo;

import java.time.Instant;
import java.util.Objects;

public final class Todo {
    private String id;
    private String content;
    private Boolean done = false;
    private Instant created;

    public Todo() {
    }

    public Todo(String id, String content, Instant created) {
        this.id = id;
        this.content = content;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {return true;}
        if (obj == null || obj.getClass() != this.getClass()) {return false;}
        var that = (Todo) obj;
        return this.id == that.id &&
               Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }

    @Override
    public String toString() {
        return "Todo[" +
               "id=" + id + ", " +
               "content=" + content + ']';
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
