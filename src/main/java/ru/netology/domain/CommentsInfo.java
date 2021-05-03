package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private int dateComment;
    private boolean canReply;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public int getDateComment() {
        return dateComment;
    }

    public void setDateComment(int dateComment) {
        this.dateComment = dateComment;
    }

    public boolean isCanReply() {
        return canReply;
    }

    public void setCanReply(boolean canReply) {
        this.canReply = canReply;
    }
}
