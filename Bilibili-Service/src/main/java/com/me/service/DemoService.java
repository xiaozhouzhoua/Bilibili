package com.me.service;

import com.me.dao.DemoDao;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DemoService {

    private final DemoDao demoDao;

    public DemoService(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

    public Map<String, Object> query(Long id) {
        return demoDao.query(id);
    }
}
