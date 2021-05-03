package ru.netology.domain.attachment;

public class Page {
    private int id;
    private int groupId;
    private int creatorId;
    private int whoCanView;
    private int whoCanEdit;
    private String title;
    private String parent;
    private String parent2;
    private String source;
    private String html;
    private String viewUrl;
    private int edited;
    private int created;
    private int editorId;
    private int views;
    private boolean currentUserCanEdit;
    private boolean currentUserCanEditAccess;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public int getWhoCanView() {
        return whoCanView;
    }

    public void setWhoCanView(int whoCanView) {
        this.whoCanView = whoCanView;
    }

    public int getWhoCanEdit() {
        return whoCanEdit;
    }

    public void setWhoCanEdit(int whoCanEdit) {
        this.whoCanEdit = whoCanEdit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getParent2() {
        return parent2;
    }

    public void setParent2(String parent2) {
        this.parent2 = parent2;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }

    public int getEdited() {
        return edited;
    }

    public void setEdited(int edited) {
        this.edited = edited;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getEditorId() {
        return editorId;
    }

    public void setEditorId(int editorId) {
        this.editorId = editorId;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isCurrentUserCanEdit() {
        return currentUserCanEdit;
    }

    public void setCurrentUserCanEdit(boolean currentUserCanEdit) {
        this.currentUserCanEdit = currentUserCanEdit;
    }

    public boolean isCurrentUserCanEditAccess() {
        return currentUserCanEditAccess;
    }

    public void setCurrentUserCanEditAccess(boolean currentUserCanEditAccess) {
        this.currentUserCanEditAccess = currentUserCanEditAccess;
    }
}
