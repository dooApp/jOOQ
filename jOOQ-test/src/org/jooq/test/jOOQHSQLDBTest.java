/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.test;

import static org.jooq.test.hsqldb.generatedclasses.tables.VAuthor.V_AUTHOR;
import static org.jooq.test.hsqldb.generatedclasses.tables.VBook.V_BOOK;

import java.sql.Date;

import org.jooq.ArrayRecord;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SchemaMapping;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UDTRecord;
import org.jooq.UpdatableTable;
import org.jooq.impl.Factory;
import org.jooq.test.hsqldb.generatedclasses.Functions;
import org.jooq.test.hsqldb.generatedclasses.Procedures;
import org.jooq.test.hsqldb.generatedclasses.PublicFactory;
import org.jooq.test.hsqldb.generatedclasses.Sequences;
import org.jooq.test.hsqldb.generatedclasses.tables.TArrays;
import org.jooq.test.hsqldb.generatedclasses.tables.TAuthor;
import org.jooq.test.hsqldb.generatedclasses.tables.TBook;
import org.jooq.test.hsqldb.generatedclasses.tables.TBookStore;
import org.jooq.test.hsqldb.generatedclasses.tables.TTriggers;
import org.jooq.test.hsqldb.generatedclasses.tables.T_639NumbersTable;
import org.jooq.test.hsqldb.generatedclasses.tables.T_658Ref;
import org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest;
import org.jooq.test.hsqldb.generatedclasses.tables.T_785;
import org.jooq.test.hsqldb.generatedclasses.tables.VLibrary;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TArraysRecord;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TAuthorRecord;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TBookStoreRecord;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TTriggersRecord;
import org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord;
import org.jooq.test.hsqldb.generatedclasses.tables.records.T_658RefRecord;
import org.jooq.test.hsqldb.generatedclasses.tables.records.T_725LobTestRecord;
import org.jooq.test.hsqldb.generatedclasses.tables.records.T_785Record;
import org.jooq.test.hsqldb.generatedclasses.tables.records.VLibraryRecord;
import org.jooq.test.hsqldb.generatedclasses.tables.records.XUnusedRecord;
import org.jooq.util.hsqldb.HSQLDBDataType;

/**
 * @author Lukas Eder
 */
public class jOOQHSQLDBTest extends jOOQAbstractTest<
        TAuthorRecord,
        TBookRecord,
        TBookStoreRecord,
        VLibraryRecord,
        TArraysRecord,
        XUnusedRecord,
        TTriggersRecord,
        T_658RefRecord,
        T_725LobTestRecord,
        T_639NumbersTableRecord,
        T_785Record> {

	@Override
    protected Factory create(SchemaMapping mapping) {
        return new PublicFactory(getConnection(), mapping);
    }

	@Override
	protected UpdatableTable<TAuthorRecord> TAuthor() {
		return TAuthor.T_AUTHOR;
	}

	@Override
	protected TableField<TAuthorRecord, String> TAuthor_LAST_NAME() {
		return TAuthor.LAST_NAME;
	}

	@Override
	protected TableField<TAuthorRecord, String> TAuthor_FIRST_NAME() {
		return TAuthor.FIRST_NAME;
	}

	@Override
	protected TableField<TAuthorRecord, Date> TAuthor_DATE_OF_BIRTH() {
		return TAuthor.DATE_OF_BIRTH;
	}

	@Override
	protected TableField<TAuthorRecord, Integer> TAuthor_YEAR_OF_BIRTH() {
		return TAuthor.YEAR_OF_BIRTH;
	}

	@Override
	protected TableField<TAuthorRecord, Integer> TAuthor_ID() {
		return TAuthor.ID;
	}

	@Override
    protected TableField<TAuthorRecord, ? extends UDTRecord<?>> TAuthor_ADDRESS() {
        return null;
    }

    @Override
	protected UpdatableTable<TBookRecord> TBook() {
		return TBook.T_BOOK;
	}

	@Override
	protected TableField<TBookRecord, Integer> TBook_ID() {
		return TBook.ID;
	}

	@Override
	protected TableField<TBookRecord, Integer> TBook_AUTHOR_ID() {
		return TBook.AUTHOR_ID;
	}

	@Override
	protected TableField<TBookRecord, String> TBook_TITLE() {
		return TBook.TITLE;
	}

    @Override
    protected UpdatableTable<TBookStoreRecord> TBookStore() {
        return TBookStore.T_BOOK_STORE;
    }

    @Override
    protected TableField<TBookStoreRecord, String> TBookStore_NAME() {
        return TBookStore.NAME;
    }

    @Override
    protected Table<T_658RefRecord> T658() {
        return T_658Ref.T_658_REF;
    }

    @Override
    protected Table<T_639NumbersTableRecord> T639() {
        return T_639NumbersTable.T_639_NUMBERS_TABLE;
    }

    @Override
    protected Table<T_725LobTestRecord> T725() {
        return T_725LobTest.T_725_LOB_TEST;
    }

    @Override
    protected TableField<T_725LobTestRecord, Integer> T725_ID() {
        return T_725LobTest.ID;
    }

    @Override
    protected TableField<T_725LobTestRecord, byte[]> T725_LOB() {
        return T_725LobTest.LOB;
    }

    @Override
    protected Table<T_785Record> T785() {
        return T_785.T_785;
    }

    @Override
    protected TableField<T_785Record, Integer> T785_ID() {
        return T_785.ID;
    }

    @Override
    protected TableField<T_785Record, String> T785_NAME() {
        return T_785.NAME;
    }

    @Override
    protected TableField<T_785Record, String> T785_VALUE() {
        return T_785.VALUE;
    }

    @Override
    protected Table<TArraysRecord> TArrays() {
        return TArrays.T_ARRAYS;
    }

    @Override
    protected TableField<TArraysRecord, Integer> TArrays_ID() {
        return TArrays.ID;
    }

    @Override
    protected TableField<TArraysRecord, String[]> TArrays_STRING() {
        return TArrays.STRING_ARRAY;
    }

    @Override
    protected TableField<TArraysRecord, Integer[]> TArrays_NUMBER() {
        return TArrays.NUMBER_ARRAY;
    }

    @Override
    protected TableField<TArraysRecord, Date[]> TArrays_DATE() {
        return TArrays.DATE_ARRAY;
    }

    @Override
    protected TableField<TArraysRecord, ? extends UDTRecord<?>[]> TArrays_UDT() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ArrayRecord<String>> TArrays_STRING_R() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ArrayRecord<Integer>> TArrays_NUMBER_R() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ArrayRecord<Date>> TArrays_DATE_R() {
        return null;
    }

    @Override
    protected TableField<TArraysRecord, ArrayRecord<Long>> TArrays_NUMBER_LONG_R() {
        return null;
    }

    @Override
    protected TableField<TBookRecord, ? extends Enum<?>> TBook_LANGUAGE_ID() {
        return TBook.LANGUAGE_ID;
    }

	@Override
    protected TableField<TBookRecord, Integer> TBook_PUBLISHED_IN() {
        return TBook.PUBLISHED_IN;
    }

    @Override
    protected TableField<TBookRecord, String> TBook_CONTENT_TEXT() {
        return TBook.CONTENT_TEXT;
    }

    @Override
    protected TableField<TBookRecord, byte[]> TBook_CONTENT_PDF() {
        return TBook.CONTENT_PDF;
    }

    @Override
    protected TableField<TBookRecord, ? extends Enum<?>> TBook_STATUS() {
        return null;
    }

    @Override
	protected Table<VLibraryRecord> VLibrary() {
		return VLibrary.V_LIBRARY;
	}

	@Override
	protected TableField<VLibraryRecord, String> VLibrary_TITLE() {
		return VLibrary.TITLE;
	}

	@Override
	protected TableField<VLibraryRecord, String> VLibrary_AUTHOR() {
		return VLibrary.AUTHOR;
	}

    @Override
    protected Table<?> VAuthor() {
        return V_AUTHOR;
    }

    @Override
    protected Table<?> VBook() {
        return V_BOOK;
    }

    @Override
    protected UpdatableTable<XUnusedRecord> TDirectory() {
        return null;
    }

    @Override
    protected TableField<XUnusedRecord, Integer> TDirectory_ID() {
        return null;
    }

    @Override
    protected TableField<XUnusedRecord, Integer> TDirectory_PARENT_ID() {
        return null;
    }

    @Override
    protected TableField<XUnusedRecord, Byte> TDirectory_IS_DIRECTORY() {
        return null;
    }

    @Override
    protected TableField<XUnusedRecord, String> TDirectory_NAME() {
        return null;
    }

    @Override
    protected UpdatableTable<TTriggersRecord> TTriggers() {
        return TTriggers.T_TRIGGERS;
    }

    @Override
    protected TableField<TTriggersRecord, Integer> TTriggers_ID() {
        return TTriggers.ID;
    }

    @Override
    protected TableField<TTriggersRecord, Integer> TTriggers_COUNTER() {
        return TTriggers.COUNTER;
    }

    @Override
    protected Field<? extends Number> FAuthorExistsField(String authorName) {
        return Functions.fAuthorExists(authorName);
    }

    @Override
    protected Field<? extends Number> FOneField() {
        return Functions.fOne();
    }

    @Override
    protected Field<? extends Number> FNumberField(Number n) {
        return Functions.fNumber((Integer) n);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Field<? extends Number> FNumberField(Field<? extends Number> n) {
        return Functions.fNumber((Field<Integer>) n);
    }

    @Override
    protected Field<? extends Number> F317Field(Number n1, Number n2, Number n3, Number n4) {
        return Functions.f317((Integer) n1, (Integer) n2, (Integer) n3, (Integer) n4);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Field<? extends Number> F317Field(Field<? extends Number> n1, Field<? extends Number> n2,
        Field<? extends Number> n3, Field<? extends Number> n4) {
        return Functions.f317((Field<Integer>) n1, (Field<Integer>) n2, (Field<Integer>) n3, (Field<Integer>) n4);
    }

    @Override
    protected Field<Result<Record>> FGetOneCursorField(Integer[] array) {
        return Functions.fGetOneCursor(array);
    }

    @Override
    protected Field<Integer[]> FArrays1Field(Field<Integer[]> array) {
        return Functions.fArrays1(array);
    }

    @Override
    protected Field<Long[]> FArrays2Field(Field<Long[]> array) {
        return Functions.fArrays2(array);
    }

    @Override
    protected Field<String[]> FArrays3Field(Field<String[]> array) {
        return Functions.fArrays3(array);
    }

    @Override
    protected <T extends ArrayRecord<Integer>> Field<T> FArrays1Field_R(Field<T> array) {
        return null;
    }

    @Override
    protected <T extends ArrayRecord<Long>> Field<T> FArrays2Field_R(Field<T> array) {
        return null;
    }

    @Override
    protected <T extends ArrayRecord<String>> Field<T> FArrays3Field_R(Field<T> array) {
        return null;
    }

    @Override
    protected Class<? extends UDTRecord<?>> cUAddressType() {
        return null;
    }

    @Override
    protected Class<? extends UDTRecord<?>> cUStreetType() {
        return null;
    }

    @Override
    protected Class<?> cProcedures() {
        return Procedures.class;
    }

    @Override
    protected boolean supportsOUTParameters() {
        return true;
    }

    @Override
    protected boolean supportsReferences() {
        return true;
    }

    @Override
    protected boolean supportsRecursiveQueries() {
        return false;
    }

    @Override
    protected Class<?> cFunctions() {
        return Functions.class;
    }

    @Override
    protected Class<?> cLibrary() {
        return null;
    }

    @Override
    protected Class<?> cSequences() {
        return Sequences.class;
    }

    @Override
    protected DataType<?>[] getCastableDataTypes() {
        return new DataType<?>[] {
            HSQLDBDataType.BIGINT,
            HSQLDBDataType.BINARY,
            HSQLDBDataType.BINARYLARGEOBJECT,
            HSQLDBDataType.BIT,
            HSQLDBDataType.BOOLEAN,
            HSQLDBDataType.CHAR,
            HSQLDBDataType.CHARACTER,
            HSQLDBDataType.CHARACTERLARGEOBJECT,
            HSQLDBDataType.CHARACTERVARYING,
            HSQLDBDataType.CHARLARGEOBJECT,
            HSQLDBDataType.DATE,
            HSQLDBDataType.DATETIME,
            HSQLDBDataType.DECIMAL,
            HSQLDBDataType.DOUBLE,
            HSQLDBDataType.DOUBLEPRECISION,
            HSQLDBDataType.FLOAT,
            HSQLDBDataType.INT,
            HSQLDBDataType.INTEGER,
            HSQLDBDataType.LONGVARBINARY,
            HSQLDBDataType.LONGVARCHAR,
            HSQLDBDataType.NUMERIC,
            HSQLDBDataType.OBJECT,
            HSQLDBDataType.OTHER,
            HSQLDBDataType.REAL,
            HSQLDBDataType.SMALLINT,
            HSQLDBDataType.TIME,
            HSQLDBDataType.TIMESTAMP,
            HSQLDBDataType.TINYINT,
            HSQLDBDataType.VARBINARY,
            HSQLDBDataType.VARCHAR,
            HSQLDBDataType.VARCHARIGNORECASE,
        };
    }
}
