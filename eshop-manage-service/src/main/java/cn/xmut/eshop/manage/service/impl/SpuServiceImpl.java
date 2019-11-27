package cn.xmut.eshop.manage.service.impl;

import cn.xmut.eshop.api.model.PmsProductImage;
import cn.xmut.eshop.api.model.PmsProductInfo;
import cn.xmut.eshop.api.model.PmsProductSaleAttr;
import cn.xmut.eshop.api.service.SpuService;
import cn.xmut.eshop.manage.mapper.SpuImageMapper;
import cn.xmut.eshop.manage.mapper.SpuInfoMapper;
import cn.xmut.eshop.manage.mapper.SpuSaleAttrInfoMapper;
import cn.xmut.eshop.manage.mapper.SpuSaleAttrValueMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 下午1:50
 */
@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private SpuInfoMapper spuInfoMapper;

    @Autowired
    private SpuImageMapper spuImageMapper;

    @Autowired
    private SpuSaleAttrInfoMapper spuSaleAttrInfoMapper;

    @Autowired
    private SpuSaleAttrValueMapper spuSaleAttrValueMapper;

    @Override
    public List<PmsProductInfo> listSpuInfo(String catalog3Id) {
        PmsProductInfo spuInfo = new PmsProductInfo();
        spuInfo.setCatalog3Id(catalog3Id);

        return spuInfoMapper.select(spuInfo);
    }

    @Override
    public void saveSpuInfo(PmsProductInfo spuInfo) {
        spuInfoMapper.insertSelective(spuInfo);

        spuImageMapper.insertBatch(spuInfo.getPmsProductImageList());
        spuSaleAttrInfoMapper.insertBatch(spuInfo.getPmsProductSaleAttrList());
        List<PmsProductSaleAttr> spuSaleAttrs = spuInfo.getPmsProductSaleAttrList();
        for (PmsProductSaleAttr spuSaleAttr : spuSaleAttrs) {
            spuSaleAttrValueMapper.insertBatch(spuSaleAttr.getPmsProductSaleAttrValueList());
        }
    }
}
