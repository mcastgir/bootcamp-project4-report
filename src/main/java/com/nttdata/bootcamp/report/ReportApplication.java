package com.nttdata.bootcamp.report;

import com.nttdata.bootcamp.report.model.document.AccountState;
import com.nttdata.bootcamp.report.model.document.AccountType;
import com.nttdata.bootcamp.report.model.document.MovementType;
import com.nttdata.bootcamp.report.service.AccountStateService;
import com.nttdata.bootcamp.report.service.AccountTypeService;
import com.nttdata.bootcamp.report.service.MovementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.ArrayList;
import java.util.List;

@EnableEurekaClient
@SpringBootApplication
public class ReportApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("AccountStateServiceRedisImpl")
	private AccountStateService accountStateService;
	@Autowired
	@Qualifier("AccountStateServiceJPAImpl")
	private AccountTypeService accountTypeService;
	@Autowired
	@Qualifier("MovementTypeServiceRedisImpl")
	private MovementTypeService movementTypeService;


	public static void main(String[] args) {
		SpringApplication.run(ReportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createAccountStates();
		createAccountTypes();
		createMovementTypes();
	}

	private void createAccountStates() {
		accountStateService.deleteAll();
		List<AccountState> states = new ArrayList<>();
		states.add(new AccountState("62f0a6fdf869dc326b8cbd82", "RA", "REQUEST ACCOUNT", true));
		states.add(new AccountState("62f0a73cf869dc326b8cbd83", "AA", "ACCEPTED ACCOUNT", true));
		states.add(new AccountState("62f0a76cf869dc326b8cbd84", "CA", "CANCELLED ACCOUNT", true));
		states.add(new AccountState("62f0a802f869dc326b8cbd85", "BA", "BLOCKED ACCOUNT", true));
		states.forEach(accountState -> accountStateService.insert(accountState));
	}

	private void createAccountTypes() {
		accountTypeService.deleteAll();
		List<AccountType> types = new ArrayList<>();
		types.add(new AccountType(1, "VIP", "CUENTA VIP", true));
		types.add(new AccountType(2, "PYM", "CUENTA PYME", true));
		types.stream().iterator().forEachRemaining(accountTypeService::insert);
	}

	private void createMovementTypes() {
		movementTypeService.deleteAll();
		List<MovementType> types = new ArrayList<>();
		types.add(new MovementType("62f0b098e8f3b41b05194cd1", "RE", "RETIRO DE CAJERO", "S", true));
		types.add(new MovementType("62f0b0bae8f3b41b05194cd2", "DE", "DEPOSITO EN CAJERO", "I", true));
		types.add(new MovementType("62f0b0dde8f3b41b05194cd3", "RV", "RETIRO EN VENTANILLA", "S", true));
		types.add(new MovementType("62f0b0e9e8f3b41b05194cd4", "DV", "DEPOSITO EN VENTANILLA", "I", true));
		types.add(new MovementType("62f0b13ee8f3b41b05194cd5", "TB", "TRANSFERENCIA BANCARIA A CUENTAS PROPIAS", "S", true));
		types.add(new MovementType("62f0b14ce8f3b41b05194cd6", "TT", "TRANSFERENCIA BANCARIA A CUENTA DE TERCEROS", "S", true));
		types.forEach(movementType -> movementTypeService.insert(movementType));
	}

}
