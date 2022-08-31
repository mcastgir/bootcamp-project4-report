package com.nttdata.bootcamp.report.model.repository;

import com.nttdata.bootcamp.report.model.document.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, String> {

}
