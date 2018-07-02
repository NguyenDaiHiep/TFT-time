package ndhiep.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ndhiep.entities.AlbumWebSpring;

public interface AlbumWebSpringService {
	public ArrayList<AlbumWebSpring> findAll();
	public  AlbumWebSpring find(int id);
	public void save(AlbumWebSpring al);
	public void delete(AlbumWebSpring al);
	//public ArrayList<AlbumWebSpring> searchKind(String kind);

}
