package br.com.devmedia.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.devmedia.domain.Musica;

@Service
public class MusicaDaoImpl implements MusicaDao{

	private EntityManager em;
	@Override
	public void salvar(Musica musica) {
		// TODO Auto-generated method stub
		em.persist(musica);
		
	}

	@Override
	public List<Musica> recuperarPorPlaylist(long playlistId) {
		// TODO Auto-generated method stub
		return em.createQuery("select m from Musica m where m.playlist.id = :playlistId",Musica.class)
				.setParameter("playlistId", playlistId).getResultList();
	}

	@Override
	public Musica recuperarPorPlaylistIdEMusicaId(long playlistId, long musicaId) {
		// TODO Auto-generated method stub
		return em.createQuery("select m from Musica m where m.playlist.id = :playlistId and m.id = :musicaId", Musica.class)
                .setParameter("playlistId", playlistId)
                .setParameter("musicaId", musicaId)
                .getSingleResult();
	}

	@Override
	public void atualizar(Musica musica) {
		// TODO Auto-generated method stub
		em.merge(musica);
		
	}

	@Override
	public void excluir(long musicaId) {
		// TODO Auto-generated method stub
		em.remove(em.getReference(Musica.class, musicaId));
	}

}
