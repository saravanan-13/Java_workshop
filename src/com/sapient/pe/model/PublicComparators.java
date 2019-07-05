package com.sapient.pe.model;

import java.util.Comparator;

public class PublicComparators {

	public enum Comparator_Type {
		AccountNumber_Ascending, AccountNumber_Descending, AccountName_Ascending, AccountName_Descending

	}

	public static Comparator<Account> getComparators(Comparator_Type comp_type) {

		switch (comp_type) {
		case AccountNumber_Ascending:
			return new AccountIdAscComparator();
		case AccountNumber_Descending:
			return new AccountIdDescComparator();
		case AccountName_Ascending:
			return new AccountNameAscComparator();
		case AccountName_Descending:
			return new AccountNameDescComparator();
		default:
			return new AccountIdAscComparator();
		}
	}

}
