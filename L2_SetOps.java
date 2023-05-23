/

	static String[] union( String[] set1, String[] set2 )
	{
		String[] unionResult = new String[ combined lengths   ]; // you must init to the min safe length
		int resultCount=0;

		add all the stuff from set 1 into the union result // we assume no dupes in set1

		for each elem in set2
			if that elem from set2 is NOT CONTAINED in set1
				add it to the unionResult // i.e.  unionResult[resultCount++] = set2[i]

		return trimArray( unionResult, resultCount );
	}


	static String[] intersect( String[] set1, String[] set2 )
	{
		String[] interResult = new String[ ?  ]; // you must init to the min safe length
		int resultCount=0;

		for each elem in set1
			if that elem from set1 is contains( String elem, String[] set2 )
				add it to the interResult // i.e.  interResult[resultCount++] = set2[i]

		return trimArray( interResult, resultCount );
	}

