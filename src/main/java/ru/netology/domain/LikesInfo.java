package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean canLike;
    private boolean userLikes;
    private boolean canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCan_publish() {
        return canPublish;
    }

    public void setCan_publish(boolean can_publish) {
        this.canPublish = can_publish;
    }
}
