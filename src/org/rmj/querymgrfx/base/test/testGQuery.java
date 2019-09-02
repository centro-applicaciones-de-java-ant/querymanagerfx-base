/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rmj.querymgrfx.base.test;

import org.rmj.appdriver.agent.GRiderX;
import org.rmj.appdriver.agent.MsgBox;
import org.rmj.querymgrfx.base.GQuery;

/**
 *
 * @author sayso
 */
public class testGQuery {
    private static GRiderX rider = null;

    public static void main(String[] args) {
        rider = new GRiderX("gRider");
        rider.logUser("gRider", "M001180037");
        if(!rider.getErrMsg().isEmpty()){
            MsgBox.showOk(rider.getMessage() + rider.getErrMsg());
            //System.exit(1);
        }
       
       GQuery qry = new GQuery();
       qry.setGRiderX(rider);
       
       //String id = qry.Decrypt("3a91ca2a03b7e46ae222", "sysadmin");
       //System.out.println(id);
       
       //qry.execute("SELECT * FROM Branch", true, "0");
       qry.adduser("M001190046", "encoder");
   }
}
