package com.example.hotel.dao.jdbc;

import com.example.hotel.model.dto.DashboradDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DashboardJDBCDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public DashboradDTO getAllValuesJDBC(){
        DashboradDTO result = new DashboradDTO();
        Map<String,Object> params = new HashMap<>();

        StringBuilder SQL = new StringBuilder();
        SQL.append("select				 					\n");
        SQL.append("    (									\n");
        SQL.append("    select								\n");
        SQL.append("        COUNT(o.order_id)				\n");
        SQL.append("    from								\n");
        SQL.append("        orders o				    	\n");
        SQL.append(") AS orderCount,						\n");
        SQL.append("(										\n");
        SQL.append("    select								\n");
        SQL.append("        COUNT(p.product_id)	    		\n");
        SQL.append("    from								\n");
        SQL.append("        product p    			        \n");
        SQL.append(") AS productCount,						\n");
        SQL.append("(										\n");
        SQL.append("    select								\n");
        SQL.append("        SUM(o.amount)			        \n");
        SQL.append("    from								\n");
        SQL.append("        orders o					    \n");
        SQL.append(") AS totalRevenue,						\n");

        return namedParameterJdbcTemplate.query(SQL.toString(), params, new ResultSetExtractor<DashboradDTO>() {
            @Override
            public DashboradDTO extractData(ResultSet rs) throws SQLException, DataAccessException {

                while (rs.next()){

                    result.setOrderCount(rs.getInt("orderCount"));
                    result.setProductCount(rs.getInt("productCount"));
                    result.setTotalRevenue(rs.getDouble("totalRevenue"));
                }
                return result;
            }
        });

    }

}


