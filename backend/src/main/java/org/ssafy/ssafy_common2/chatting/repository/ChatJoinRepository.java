package org.ssafy.ssafy_common2.chatting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ssafy.ssafy_common2.chatting.entity.Message;

public interface ChatJoinRepository extends JpaRepository<Message,Long> {
}
