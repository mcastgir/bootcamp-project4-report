package com.nttdata.bootcamp.report.model.repository.impl;

import com.nttdata.bootcamp.report.model.document.AccountState;
import com.nttdata.bootcamp.report.model.repository.AccountStateRepository;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class AccountStateRepositoryImpl implements AccountStateRepository {

    private static final String KEY = "accountState";

    private RedisTemplate<String, AccountState> redisTemplate;
    private HashOperations hashOperations;

    public AccountStateRepositoryImpl(RedisTemplate<String, AccountState> redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(AccountState accountState) {
        hashOperations.put(KEY, accountState.getId(), accountState);
    }

    @Override
    public void delete(String id) {
        hashOperations.delete(KEY, id);
    }

    @Override
    public void deleteAll() {
        hashOperations.entries(KEY).values().forEach(value -> {
            AccountState accountState = (AccountState) value;
            delete(accountState.getId());
        });
    }

    @Override
    public AccountState findById(String id) {
        return (AccountState) hashOperations.get(KEY, id);
    }

    @Override
    public Map<String, AccountState> findAll() {
        return hashOperations.entries(KEY);
    }

}
