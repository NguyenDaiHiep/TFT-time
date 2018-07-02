package ndhiep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import ndhiep.entities.AlbumWebSpring;
import ndhiep.services.AlbumWebSpringService;

@Controller
@RequestMapping("/")
public class  AlbumWebSpringController	 {

	@Autowired
	private AlbumWebSpringService albumWebSpringService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index(ModelMap modelmap) {
		System.out.println(albumWebSpringService.findAll());
		modelmap.put("albums", albumWebSpringService.findAll());
		return "index";

	}
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(ModelMap modelmap) {
		modelmap.put("album", new AlbumWebSpring());
		return "add";

	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("album") AlbumWebSpring album) {
		albumWebSpringService.save(album);
		return "redirect:/";

	}
	@RequestMapping(value = "/delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable("id") int id){
		albumWebSpringService.delete(albumWebSpringService.find(id));
		return "redirect:/";
	}
	@RequestMapping(value = "/edit/{id}",method=RequestMethod.GET)
	public String edit(@PathVariable("id") int id, ModelMap modelmap){
		modelmap.put("album", albumWebSpringService.find(id));
		return "edit";
	}
	@RequestMapping(value = "/edit",method=RequestMethod.POST)
	public String edit(@ModelAttribute("album") AlbumWebSpring album){
		AlbumWebSpring currentAlbum = albumWebSpringService.find(album.getId());
		currentAlbum.setNameAlbum(album.getNameAlbum());
		currentAlbum.setKind(album.getKind());
		if(!album.getNameAlbum().isEmpty()){
			currentAlbum.setNameAlbum(album.getNameAlbum());
		}
		if(!album.getKind().isEmpty()){
			currentAlbum.setKind(album.getKind());
		}
		albumWebSpringService.save(album);
		return "redirect:/";
	}


}
