package ndhiep.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ndhiep.entities.AlbumWebSpring;

@Repository("albumWebSpringDao")
public interface AlbumWebSpringDao extends CrudRepository<AlbumWebSpring, Integer> {
	//public AlbumWebSpring findById(int id);
//	@Query("select * from album a where a.kind = :kind")
//	public ArrayList<AlbumWebSpring> findbyKind(@Param("kind") String kind );
	
}
