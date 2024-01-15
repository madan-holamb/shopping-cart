package com.osc.websocket.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.osc.websocket.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

	@Query("SELECT p.category.categoryId, p.category.categoryName, SUM(p.viewCount) AS TOTAL_COUNT " +
			"FROM products p " +
			"GROUP BY p.category.categoryId,p.category.categoryName " +
			"ORDER BY TOTAL_COUNT DESC, p.category.categoryId ASC")
	List<Object[]> findCategories();	

	List<Product> findAllByOrderByViewCountDescProductIdAsc();

	@Query("FROM products p WHERE p.category.categoryId =:categoryId ORDER BY p.viewCount DESC,p.productId ASC ")
	List<Product> findSimilarProducts(@Param("categoryId")Character categoryId);

	@Query("FROM products p WHERE p.category.categoryId =:categoryId ORDER BY p.viewCount DESC")
	List<Product> findWithOffsetAndLimit(@Param("categoryId") Character categoryId,Pageable pageable);

	@Query("SELECT p, (SELECT COUNT(p2) + 1 FROM products p2 WHERE p2.viewCount > p.viewCount AND p2.category.categoryId = p.category.categoryId) AS viewCountRank " +
			"FROM products p WHERE p.productId = :productId")
	List<Object[]> findProductAndViewCountRank(@Param("productId") String productId);
	
	@Query("FROM products p WHERE p.category.categoryId = :categoryId")
    List<Product> findByCategoryId(@Param("categoryId") Character categoryId, Sort sort);
}
