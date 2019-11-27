package cn.xmut.eshop.manage.controller;

import cn.xmut.eshop.api.model.PmsBaseAttrInfo;
import cn.xmut.eshop.api.model.PmsBaseAttrValue;
import cn.xmut.eshop.api.service.AttrService;
import cn.xmut.eshop.api.vo.R;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Echo
 * @date 2019-11-27 上午11:06
 */
@RequestMapping("/attr")
@RestController
public class AttrController {

    @Reference
    private AttrService attrService;

    @PostMapping("/baseInfo/list")
    public R listBaseAttrInfo(@RequestParam("catalog3Id") String catalog3Id){
        List<PmsBaseAttrInfo> baseAttrInfos = attrService.listBaseAttrInfo(catalog3Id);
        return R.ok(baseAttrInfos);
    }

    @PostMapping("/baseValue/list")
    public R listBaseAttrValue(@RequestParam("attrInfoId") String attrInfoId){
        List<PmsBaseAttrValue> baseAttrValues = attrService.listBaseAttrValue(attrInfoId);
        return R.ok(baseAttrValues);
    }

    @PostMapping("/baseInfo")
    public R saveBaseAttrInfo(@RequestBody PmsBaseAttrInfo baseAttrInfo){
        attrService.saveBaseAttrInfo(baseAttrInfo);
        return R.ok();
    }

    @PutMapping("/baseInfo")
    public R updateBaseAttrInfo(@RequestBody PmsBaseAttrInfo baseAttrInfo){
        attrService.updateBaseAttrInfo(baseAttrInfo);
        return R.ok();
    }

}
