/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.data.pipeline.spi.ingest.dumper;

import org.apache.shardingsphere.infra.spi.DatabaseTypedSPI;
import org.apache.shardingsphere.infra.util.spi.annotation.SingletonSPI;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 * Column value reader.
 */
@SingletonSPI
public interface ColumnValueReader extends DatabaseTypedSPI {
    
    /**
     * Read column value.
     *
     * @param resultSet result set
     * @param resultSetMetaData result set meta data
     * @param columnIndex column index
     * @return column value
     * @throws SQLException from database
     */
    Object readValue(ResultSet resultSet, ResultSetMetaData resultSetMetaData, int columnIndex) throws SQLException;
}
