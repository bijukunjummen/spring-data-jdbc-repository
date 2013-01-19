package org.springframework.data.jdbc.derby;

import org.springframework.data.jdbc.TableDescription;
import org.springframework.data.jdbc.sql.DerbySqlGenerator;

/**
 * @author Tomasz Nurkiewicz
 * @since 1/19/13, 10:13 PM
 */
public class CommentWithUserDerbySqlGenerator extends DerbySqlGenerator {

	public CommentWithUserDerbySqlGenerator() {
		super("c.*, u.date_of_birth, u.reputation, u.enabled");
	}

	public String selectAll(TableDescription table) {
		return "SELECT " + getAllColumnsClause() + " FROM " + table.getFromClause();
	}

}