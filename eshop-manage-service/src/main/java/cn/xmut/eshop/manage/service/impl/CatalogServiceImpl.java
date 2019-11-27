package cn.xmut.eshop.manage.service.impl;

import cn.xmut.eshop.api.model.PmsBaseCatalog1;
import cn.xmut.eshop.api.model.PmsBaseCatalog2;
import cn.xmut.eshop.api.model.PmsBaseCatalog3;
import cn.xmut.eshop.api.service.CatalogService;
import cn.xmut.eshop.manage.mapper.Catalog1Mapper;
import cn.xmut.eshop.manage.mapper.Catalog2Mapper;
import cn.xmut.eshop.manage.mapper.Catalog3Mapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 上午8:38
 */
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private Catalog1Mapper catalog1Mapper;

    @Autowired
    private Catalog2Mapper catalog2Mapper;

    @Autowired
    private Catalog3Mapper catalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> listCatalog1() {
        return catalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> listCatalog2(String catalog1Id) {
        PmsBaseCatalog2 catalog2 = new PmsBaseCatalog2();
        catalog2.setCatalog1Id(catalog1Id);

        return catalog2Mapper.select(catalog2);
    }

    @Override
    public List<PmsBaseCatalog3> listCatalog3(String catalog2Id) {
        PmsBaseCatalog3 catalog3 = new PmsBaseCatalog3();
        catalog3.setCatalog2Id(catalog2Id);

        return catalog3Mapper.select(catalog3);
    }

}
