/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rmj.querymgrfx.base.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.rmj.appdriver.agent.GRiderX;
import org.rmj.appdriver.agent.MsgBox;
import org.rmj.appdriver.agentfx.CommonUtils;
import org.rmj.querymgrfx.base.GQuery;

/**
 *
 * @author sayso
 */
public class testGQuery {
    private static GRiderX rider = null;

    public static void main(String[] args) {
        rider = new GRiderX("gRider");
        rider.logUser("gRider", "M033070005");
        if(!rider.getErrMsg().isEmpty()){
            MsgBox.showOk(rider.getMessage() + rider.getErrMsg());
            //System.exit(1);
        }
       
       GQuery qry = new GQuery();
       qry.setGRiderX(rider);
       
//       String id = qry.Decrypt("3a91ca2a03b7e46ae222", "sysadmin");
//       System.out.println(id);
       
       //qry.execute("SELECT * FROM Branch", true, "0");
       qry.adduser("M001220014", "encoder");
       qry.adduser("M001220008", "encoder");
       qry.adduser("M001220015", "encoder");
       qry.adduser("M001220016", "encoder");
//       qry.execute("SELECT * FROM Branch", true, "0");
//       System.out.println(qry.getMessage());
//       ResultSet rs = qry.getResult();
//       
//        try {
//            for(int x=1;x<=rs.getMetaData().getColumnCount();x++){
//                System.out.print(x);
//                System.out.println("=>" + rs.getMetaData().getColumnName(x) + "=>" + rs.getMetaData().getColumnTypeName(x));
//            }
//            System.out.println(rs.getMetaData().getColumnTypeName(5));
//            while(rs.next()){
//                String coltype = rs.getMetaData().getColumnTypeName(20);
//                if(coltype.toLowerCase().contains("time")){
//                    //Date date = rs.getObject("dTimeStmp");
//                    Object obj = rs.getObject("dTimeStmp");
//                    System.out.println(obj);
////                    if(CommonUtils.isDate(obj, "YYYY-MM-DD")){
////                        System.out.println(rs.getString("dTimeStmp"));
////                    }
////                    else{
////                        System.out.println("not valid");
////                    }
//                }
//                else{
//                    System.out.println(rs.getString("dTimeStmp"));
//                }
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
   }
}
