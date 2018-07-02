package ndhiep.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ndhiep.dao.AlbumWebSpringDao;
import ndhiep.entities.AlbumWebSpring;

@Service("albumWebSpringService")
public class AlbumWebSpringServiceIpml implements AlbumWebSpringService {
	@Autowired
	private AlbumWebSpringDao albumWebSpringDao;

	@Override
	public ArrayList<AlbumWebSpring> findAll() {
		// TODO Auto-generated method stub
		return (ArrayList<AlbumWebSpring>) albumWebSpringDao.findAll();
	}

	@Override
	public void save(AlbumWebSpring al) {
		// TODO Auto-generated method stub
		albumWebSpringDao.save(al);

	}

	@Override
	public void delete(AlbumWebSpring al) {
		// TODO Auto-generated method stub
		albumWebSpringDao.delete(al);

	}

	@Override
	public AlbumWebSpring find(int id) {
		// TODO Auto-generated method stub
		return albumWebSpringDao.findById(id).get();
	}

	// @Override
	// public ArrayList<AlbumWebSpring> searchKind(String kind) {
	// return albumWebSpringDao.findbyKind(kind);
	//
	//
	// }

}
