package com.example.cloth_sales_system.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.cloth_sales_system.constants.ClothSalesForCustomerMsgCode;
import com.example.cloth_sales_system.constants.ClothSalesForShopMsgCode;
import com.example.cloth_sales_system.entity.ClothSalesForCustomer;
import com.example.cloth_sales_system.entity.ClothSalesForShop;
import com.example.cloth_sales_system.repository.ClothSalesForCustomerDAO;
import com.example.cloth_sales_system.repository.ClothSalesForShopDAO;
import com.example.cloth_sales_system.repository.ClothSalesForShoppingCarDAO;
import com.example.cloth_sales_system.service.ifs.ClothSalesService;
import com.example.cloth_sales_system.vo.ClothSalesReq;
import com.example.cloth_sales_system.vo.ClothSalesRes;

@Service
public class ClothSalesServiceImpl implements ClothSalesService {

	@Autowired
	private ClothSalesForShopDAO clothSalesForShopDAO;

	@Autowired
	private ClothSalesForCustomerDAO clothSalesForCustomerDAO;

	@Autowired
	private ClothSalesForShoppingCarDAO clothSalesForShoppingCarDAO;

	@Override
	public ClothSalesRes addItemInfo(ClothSalesReq req) {

		if (clothSalesForShopDAO.existsById(req.getProductNumber())) {
			return new ClothSalesRes(ClothSalesForShopMsgCode.ITEM_EXISTED.getMessage());
		}

		ClothSalesRes checkResult = checkParamForShop(req);
		if (checkResult != null) {
			return checkResult;
		}

		ClothSalesForShop clothSalesForShop = new ClothSalesForShop(req);
		clothSalesForShopDAO.save(clothSalesForShop);
		return new ClothSalesRes(ClothSalesForShopMsgCode.SUCCESSFUL.getMessage());
	}

	private ClothSalesRes checkParamForShop(ClothSalesReq req) {
		if (!StringUtils.hasText(req.getProductNumber())) {
			return new ClothSalesRes(ClothSalesForShopMsgCode.PRODUCT_NUMBER_REQUIRED.getMessage());
		} else if (!StringUtils.hasText(req.getProductName())) {
			return new ClothSalesRes(ClothSalesForShopMsgCode.PRODUCT_NAME_REQUIRED.getMessage());
		} else if (req.getProductQuantity() == null || req.getProductQuantity() < 0) {
			return new ClothSalesRes(ClothSalesForShopMsgCode.PRODUCT_QUANTITY_REQUIRED.getMessage());
		} else if (req.getProductPrice() == null || req.getProductPrice() <= 0) {
			return new ClothSalesRes(ClothSalesForShopMsgCode.PRODUCT_PRICE_REQUIRED.getMessage());
		}
		return null;
	}

	@Override
	public ClothSalesRes updateItemInfo(ClothSalesReq req) {

		ClothSalesRes res = new ClothSalesRes();

		if (!StringUtils.hasText(req.getProductNumber())) {
			res.setMessage("�п�J���T���ӫ~�s��");
			return res;
		}

		Optional<ClothSalesForShop> itemInfo = clothSalesForShopDAO.findById(req.getProductNumber());
		if (!itemInfo.isPresent()) {
			res.setMessage("�п�J���T���ӫ~�s��");
			return res;
		}

		int nullCount = 3;
		ClothSalesForShop clothSalesForShop = itemInfo.get();
		if (StringUtils.hasText(req.getProductName())) {
			clothSalesForShop.setProductName(req.getProductName());
			nullCount--;
		}

		if (req.getProductQuantity() != null) {
			if (req.getProductQuantity() < 0) {
				res.setMessage("�w�s���o���t��");
				return res;
			}
			clothSalesForShop.setProductQuantity(req.getProductQuantity());
			nullCount--;
		}

		if (req.getProductPrice() != null) {
			if (req.getProductPrice() <= 0) {
				res.setMessage("���椣�o���t�Ʃ�0");
				return res;
			}
			clothSalesForShop.setProductPrice(req.getProductPrice());
			nullCount--;
		}

		if (nullCount == 3) {
			res.setMessage("���ܧ�������");
			return res;
		}

		clothSalesForShopDAO.save(clothSalesForShop);
		res.setClothSalesForShop(clothSalesForShop);
		res.setMessage("�ק令�\");
		return res;
	}

	@Override
	public ClothSalesRes inquireInventory(ClothSalesReq req) {

		ClothSalesRes res = new ClothSalesRes();
		if (!StringUtils.hasText(req.getProductNumber())) {
			res.setMessage("�п�J�ӫ~�s��");
			return res;
		}
		List<ClothSalesForShop> inquireList = clothSalesForShopDAO.findAllByProductNumber(req.getProductNumber());
		if (inquireList.isEmpty()) {
			res.setMessage("�d�L�����");
			return res;
		}
		res.setInquireListForShop(inquireList);
		return res;
	}

	@Override
	public ClothSalesRes inquireProduct(ClothSalesReq req) {

		ClothSalesRes res = new ClothSalesRes();
		if (!StringUtils.hasText(req.getProductName())) {
			res.setMessage("�п�J�ӫ~�W��");
			return res;
		}

		List<ClothSalesForShop> inquireList = clothSalesForShopDAO.findAllByProductName(req.getProductName());
		if (inquireList.isEmpty()) {
			res.setMessage("�d�L�����");
			return res;
		}

		res.setInquireListForShop(inquireList);
		return res;
	}

	@Override
	public ClothSalesRes addCustomerInfo(ClothSalesReq req) {

		if (clothSalesForCustomerDAO.existsById(req.getMembersId())) {
			return new ClothSalesRes(ClothSalesForCustomerMsgCode.MEMBERS_ID_EXISTED.getMessage());
		}

		ClothSalesRes checkResult = checkParamForCustomer(req);
		if (checkResult != null) {
			return checkResult;
		}

		ClothSalesForCustomer clothSalesForCustomer = new ClothSalesForCustomer(req);
		clothSalesForCustomerDAO.save(clothSalesForCustomer);
		return new ClothSalesRes(ClothSalesForCustomerMsgCode.SUCCESSFUL.getMessage());
	}

	private ClothSalesRes checkParamForCustomer(ClothSalesReq req) {
		if (!StringUtils.hasText(req.getMembersId())) {
			return new ClothSalesRes(ClothSalesForCustomerMsgCode.MEMBERS_ID_REQUIRED.getMessage());
		} else if (!StringUtils.hasText(req.getMemberName())) {
			return new ClothSalesRes(ClothSalesForCustomerMsgCode.MEMBER_NAME_REQUIRED.getMessage());
		} else if (!StringUtils.hasText(req.getMemberPassword())) {
			return new ClothSalesRes(ClothSalesForCustomerMsgCode.MEMBER_PASSWORD_REQUIRED.getMessage());
		} else if (!StringUtils.hasText(req.getEmail())) {
			return new ClothSalesRes(ClothSalesForCustomerMsgCode.EMAIL_REQUIRED.getMessage());
		} else if (req.getMemberPhoneNumber() == null) {
			return new ClothSalesRes(ClothSalesForCustomerMsgCode.MEMBER_PHONE_NUMBER_REQUIRED.getMessage());
		}
		return null;
	}

	@Override
	public ClothSalesRes inquireMembersInfoByMembersId(ClothSalesReq req) {

		ClothSalesRes res = new ClothSalesRes();
		if (!StringUtils.hasText(req.getMembersId())) {
			res.setMessage("�п�J�|���s��");
			return res;
		}

		List<ClothSalesForCustomer> inquireList = clothSalesForCustomerDAO.findAllByMembersId(req.getMembersId());
		if (inquireList.isEmpty()) {
			res.setMessage("�d�L�����");
			return res;
		}
		res.setInquireListForCustomer(inquireList);
		return res;
	}
}
