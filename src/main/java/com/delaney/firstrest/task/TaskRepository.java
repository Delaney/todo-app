package com.delaney.firstrest.task;

import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Item, Long> {
    
}
