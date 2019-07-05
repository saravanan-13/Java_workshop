package com.sapient.pe.model;

import java.util.Comparator;

class AccountIdAscComparator implements Comparator<Account> {

	@Override
	public int compare(Account one, Account two) {

		return Long.valueOf(one.getAccountNumber()).compareTo(two.getAccountNumber());
	}

}

class AccountIdDescComparator implements Comparator<Account> {

	@Override
	public int compare(Account one, Account two) {

		return Long.valueOf(two.getAccountNumber()).compareTo(one.getAccountNumber());
	}

}

 class AccountNameAscComparator implements Comparator<Account> {

 @Override
 public int compare(Account one, Account two) {

 return one.getPerson().getName().compareTo(two.getPerson().getName());
 }

 }

 class AccountNameDescComparator implements Comparator<Account> {

 @Override
 public int compare(Account one, Account two) {

 return two.getPerson().getName().compareTo(one.getPerson().getName());
 }

 }
