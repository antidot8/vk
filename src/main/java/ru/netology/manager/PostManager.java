package ru.netology.manager;

import ru.netology.domain.Post;

public class PostManager {

    public Post[] search(int ownerID, String domain, String query, boolean ownersOnly, int count, int offset) { //если рассматривать ВК значение count логичнее поставить тип byte, но если требуется более 127 записей при поиске лучше оставить int
        return null;
    }

    public void delete(int ownerID, int postID) {
    }
}
