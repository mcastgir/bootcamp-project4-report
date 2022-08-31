package com.nttdata.bootcamp.report.service.impl.mongo;

import com.nttdata.bootcamp.report.model.dao.SignerDao;
import com.nttdata.bootcamp.report.model.document.Signer;
import com.nttdata.bootcamp.report.service.SignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignerServiceImpl implements SignerService {

    @Autowired
    private SignerDao signerDao;

    @Override
    public List<Signer> findAll() {
        return signerDao.findAll();
    }

}
