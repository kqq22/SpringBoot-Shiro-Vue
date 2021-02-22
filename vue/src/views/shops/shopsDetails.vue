<template>
  <div class="app-container">
    <el-form ref="form" :model="form" label-width="100px" style="width: 30%;" :disabled="disabled">
    <el-form-item label="商家名称：">
      <el-input v-model="form.shopsName"></el-input>
    </el-form-item>
    <el-form-item label="联系电话：">
      <el-input v-model="form.shopsPhone"></el-input>
    </el-form-item>
    <el-form-item label="商家地址：">
      <el-input v-model="form.shopsAddress"></el-input>
    </el-form-item>
    <el-form-item label="营业时间：">
      <el-col :span="11">
        <el-time-picker placeholder="选择时间" value-format="HH:mm:ss" v-model="form.businessHoursStart" style="width: 100%;"></el-time-picker>
      </el-col>
      <el-col class="line" :span="2">&nbsp;&nbsp;至</el-col>
      <el-col :span="11">
        <el-time-picker placeholder="选择时间" value-format="HH:mm:ss" v-model="form.businessHoursEnd" style="width: 100%;"></el-time-picker>
      </el-col>
    </el-form-item>
    <el-form-item label="商家简介：">
      <el-input type="textarea" v-model="form.shopsIntro" ></el-input>
    </el-form-item>
</el-form>
  <div class="app-container">
    <el-button type="primary" @click="updateStyle">修改</el-button>
    <el-button id="submit" :style="{display: display}" @click="submit">提交</el-button>
  </div>
  </div>
</template>
<script>
  export default {
    data() {
      return {
        form: {
          shopsName: "", //商家名称
          shopsPhone: "", //联系电话
          shopsAddress: "", //商家地址
          businessHoursStart: "", //营业开始时间
          businessHoursEnd: "", //打烊时间
          shopsIntro: "" //商家简介
        },
        display: "none", //样式
        disabled: true, //是否禁用
      }
    },
    created() {
      this.getDetails();
    },
    methods: {
      getDetails(){
        //查询商家详情
        this.api({
          url: "/shops/findShopsDetails",
          method: "get",
          params: this.form 
        }).then(data => {
          this.form = data.list[0];
        })
      },
      updateStyle() {
        //修改样式
        this.display = "inline";
        this.disabled = false;
      },
      submit() {
        console.log(this.form);
        this.api({
          url: "/shops/updateShopsDetails",
          method: "post",
          data: this.form
        }).then(() => {
          this.getDetails();
          location.reload();
        })
      }
    }
  }
</script>
<style scoped>
  .main{
    text-align: center;
    background-color: #fff;
    border-radius: 20px;
    width: 300px;
    height: 350px;
    margin: auto;
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
  }
</style>
