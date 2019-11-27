package cn.xmut.eshop.api.service;

import cn.xmut.eshop.api.model.PmsBaseCatalog1;
import cn.xmut.eshop.api.model.PmsBaseCatalog2;
import cn.xmut.eshop.api.model.PmsBaseCatalog3;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 上午8:43
 */
public interface CatalogService {

    List<PmsBaseCatalog1> listCatalog1();

    List<PmsBaseCatalog2> listCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> listCatalog3(String catalog2Id);
}
