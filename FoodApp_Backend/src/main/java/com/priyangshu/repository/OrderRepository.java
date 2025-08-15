package com.priyangshu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.priyangshu.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
@Query(
		nativeQuery = true,
		value="select O.OID,O.ODT,O.FID,F.FNAME,O.QTY,F.PRICE,O.QTY*F.PRICE NETPRICE,O.UNAME FROM ORDR_DTLS O JOIN FOOD F ON(O.FID=F.FID)"
		)
public List getbills();
}
