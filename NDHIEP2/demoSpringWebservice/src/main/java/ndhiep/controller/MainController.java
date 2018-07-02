package ndhiep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ndhiep.model.Album;
import ndhiep.service.AlbumService;

@RestController
@RequestMapping("/")
public class MainController {

	@Autowired
	private AlbumService albumService;

	@RequestMapping(value = "/getall", method = RequestMethod.GET, produces={MediaType.APPLICATION_XML_VALUE})
	public List<Album> index() {

		return albumService.findAll();

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,produces={MediaType.APPLICATION_XML_VALUE} )
	public Album getId(@PathVariable("id") int id) {
		Album ab = albumService.find(id);
		if (ab == null) {
			System.out.println(id + "not exxits");
			}
		return ab;

	}

	@PostMapping("/add")
	public void add(@RequestBody Album al) {
		albumService.save(al);

	}

	@DeleteMapping(value = "/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		albumService.delete(id);

	}

	@PutMapping(value = "update")
	public Album update(@RequestBody Album al) {
		Album alTemp = albumService.find(al.getId());
		if (alTemp != null) {
			albumService.save(al);
			return al;
		}
		return alTemp;

	}
}
