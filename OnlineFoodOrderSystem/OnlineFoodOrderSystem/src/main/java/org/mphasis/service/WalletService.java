package org.mphasis.service;

import java.util.List;
import java.util.Optional;

import org.mphasis.model.Wallet;
import org.mphasis.repository.WalletDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WalletService {
	@Autowired
	private WalletDAO wdao;

	public List<Wallet> findAll() {
		return (List<Wallet>) wdao.findAll();
	}

	public Optional<Wallet> findById(int id) {
		return wdao.findById(id);
	}

	public Wallet addWallet(Wallet wallet) {
		return wdao.save(wallet);
	}

	public Wallet updateWallet(int id, Wallet wallet) {
		Wallet updated = wdao.findById(id).orElse(null);
		updated.setWal_id(wallet.getWal_id());
		updated.setCus_id(wallet.getCus_id());
		updated.setWal_amount(wallet.getWal_amount());
		updated.setWal_source(wallet.getWal_source());
		
		return wdao.save(updated);
	}

	public void deleteById(int id) {
		wdao.deleteById(id);
	}

	public void save(Wallet wallet) {
	
		
	}

}
