package br.com.devmedia.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devmedia.dao.PlaylistDao;
import br.com.devmedia.domain.Playlist;

@Service
@Transactional
public class PlaylistServiceImpl implements PlaylistService {
	
	@Autowired
	private PlaylistDao playlistDao;
	
	@Override
	public void salvar(Playlist playlist) {
		// TODO Auto-generated method stub
		playlistDao.salvar(playlist);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Playlist> recuperar() {
		// TODO Auto-generated method stub
		return playlistDao.recuperar();
	}

	@Override
	@Transactional(readOnly = true)
	public Playlist recuperarPorId(long id) {
		// TODO Auto-generated method stub
		return playlistDao.recuperarPorId(id);
	}

	@Override
	public void atualizar(Playlist playlist) {
		// TODO Auto-generated method stub
		playlistDao.atualizar(playlist);
	}

	@Override
	public void excluir(long id) {
		// TODO Auto-generated method stub
		playlistDao.excluir(id);
	}

}