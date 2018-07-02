package ndhiep.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ndhiep.model.Album;
import ndhiep.repository.AlbumRepository;

@Service
public class AlbumService {
	
	@Autowired
	public AlbumRepository albumRepository;
	
	public ArrayList<Album> findAll() {
		return (ArrayList<Album>) albumRepository.findAll();
	}

	public void save(Album al) {
		 albumRepository.save(al);

	}

	public void delete(int id) {
		albumRepository.deleteById(id);

	}

	public Album find(int id) {
		return albumRepository.findById(id).get();
	}
	

}
