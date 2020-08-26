package com.calaca.exemplo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoRest {
	
		@Autowired
		private VeiculoDao veiculoDao;
		
		@GetMapping
		public List<Veiculo> get(){
			return veiculoDao.findAll();
		}
		@PostMapping
		public void post(@RequestBody Veiculo veiculo) {
			veiculoDao.save(veiculo);
		}
		
		@DeleteMapping("/{id}")
		public void delete(Integer id) {
			veiculoDao.deleteById(id);
		}
}
