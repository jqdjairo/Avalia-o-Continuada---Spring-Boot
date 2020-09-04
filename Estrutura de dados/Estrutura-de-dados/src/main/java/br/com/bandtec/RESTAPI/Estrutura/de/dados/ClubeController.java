package br.com.bandtec.RESTAPI.Estrutura.de.dados;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clubes")
public class ClubeController {
    private List<Plano> planos = new ArrayList<>();


    @GetMapping
    public ResponseEntity listarPlano(){
        if (planos.isEmpty()){
            return ResponseEntity.status(204).build();
        }else{

        return ResponseEntity.ok(planos);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity recuperarPlano(@PathVariable int id){
        if(planos.size() >= id){
            return ResponseEntity.ok(planos.get(id-1));
        }else{
            return ResponseEntity.status(404).build();
        }
    }
    

    @PostMapping("/cadeira")
    public ResponseEntity cadastrarSocioCadeira(@RequestBody MinhaCadeira minhaCadeira){
        planos.add(minhaCadeira);
        return ResponseEntity.status(201).build();
    }
    @PostMapping("/historia")
    public ResponseEntity cadastrarSocioHistoria(@RequestBody MinhaHistoria minhaHistoria){
        planos.add(minhaHistoria);
        return ResponseEntity.status(201).build();
    }
    @PostMapping("/vida")
    public ResponseEntity cadastrarSocioVida(@RequestBody MinhaVida minhaVida){
        planos.add(minhaVida);
        return ResponseEntity.status(201).build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deletarSocio(@PathVariable int id){
        if (planos.size() >= id){
            planos.remove(id-1);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.status(404).build();
        }

    }

    @PutMapping("alterar/{id}")
    public void alterarSocio(@PathVariable int id, @RequestBody MinhaCadeira minhaCadeira){
        planos.remove(id-1);
        planos.add(id-1,minhaCadeira);
    }
    @GetMapping("/cadeira")
    public ResponseEntity getPlanoCadeira(){
        List<Plano> socioPlano = planos.stream().filter(plano -> plano.getNomePlano().equals("Minha cadeira")).
                collect(Collectors.toList());
        if (socioPlano.isEmpty()){
            return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.ok(socioPlano);
        }
    }
    @GetMapping("/historia")
    public ResponseEntity getPlanoHistoria(){
        List<Plano> socioPlano = planos.stream().filter(plano -> plano.getNomePlano().equals("Minha historia")).
                collect(Collectors.toList());
        if (socioPlano.isEmpty()){
            return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.ok(socioPlano);
        }
    }
    @GetMapping("/vida")
    public ResponseEntity getPlanoVida(){
        List<Plano> socioPlano = planos.stream().filter(plano -> plano.getNomePlano().equals("Minha vida")).
                collect(Collectors.toList());
        if (socioPlano.isEmpty()){
            return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.ok(socioPlano);
        }
    }
}
