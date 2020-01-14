package com.edu.ls.respository;

import com.edu.ls.model.GoodsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<GoodsModel,Integer> {
}
