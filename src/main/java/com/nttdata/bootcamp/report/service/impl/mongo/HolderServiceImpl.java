package com.nttdata.bootcamp.report.service.impl.mongo;

import com.nttdata.bootcamp.report.model.dao.HolderDao;
import com.nttdata.bootcamp.report.model.document.Holder;
import com.nttdata.bootcamp.report.service.HolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolderServiceImpl implements HolderService {

    @Autowired
    private HolderDao holderDao;

    @Override
    public List<Holder> findAll() {
        return holderDao.findAll();
    }

}
