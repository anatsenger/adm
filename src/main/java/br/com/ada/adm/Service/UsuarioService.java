package br.com.ada.adm.Service;

import br.com.ada.adm.model.Usuario;
import br.com.ada.adm.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {
        Usuario usuarioEncontrado = usuarioRepository.findByCPF(usuario.getCPF());
        if(usuarioEncontrado != null){
            throw new IllegalArgumentException();
        }
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}
