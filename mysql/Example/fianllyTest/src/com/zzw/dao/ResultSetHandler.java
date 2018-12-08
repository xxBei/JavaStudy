package com.zzw.dao;

import java.sql.ResultSet;

public interface ResultSetHandler<T> {
    T handle(ResultSet rs);
}
