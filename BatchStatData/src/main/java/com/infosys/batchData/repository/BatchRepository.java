/**
 * 
 */
package com.infosys.batchData.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infosys.batchData.entity.BatchStat;

/**
 * @author Manisha
 *
 */

@Repository
public interface BatchRepository extends  CrudRepository<BatchStat, Integer>  {
	
	 @Query("FROM BatchStat")
	    public List<BatchStat> getAll();

}
