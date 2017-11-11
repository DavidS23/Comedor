/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comedor.EJB;

import com.comedor.model.Mesa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author davsa
 */
@Local
public interface MesaFacadeLocal {

    void create(Mesa mesa);

    void edit(Mesa mesa);

    void remove(Mesa mesa);

    Mesa find(Object id);

    List<Mesa> findAll();

    List<Mesa> findRange(int[] range);

    int count();
    
}