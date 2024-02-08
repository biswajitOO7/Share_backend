package com.shareTracker.ShareTracker.repository;

import com.shareTracker.ShareTracker.model.Share;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShareRepository extends JpaRepository<Share,Long> {
}
