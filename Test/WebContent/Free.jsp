<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<STYLE type="text/css">
    
     h1{background-color:blue;
     width:525px;
     font-family:STXingkai;}
     body{
        background-image:url("Image/5c88e1307097f.jpg");
        background-repeat:no-repeat;
        /*background-position:right top;*/
        background-size:100% 100%; 
        background-attachment: fixed;
        /* margin-right:200px; */
     }
    </STYLE>
</head>
<body>
<form action="Compute" method="post">
       <!--  目的地：<input type="text" name="place" placeholder="中国或者其他" required="" autocomplete="off"><br/>
       -->
       目的地：<select name="place">
         <option value="国内">涉及到国内的航程</option>
          <option value="区域一">涉及日本,美洲,俄罗斯,迪拜的航程,以及新加坡始发到中国的航程</option>
           <option value="区域二">涉及中西亚的航程</option>
            <option value="区域三">涉及内罗毕的航程</option>
             <option value="区域四">除日本,每周,澳新,俄罗斯,迪拜,内罗毕,中西亚以外的国际/地区航程</option>
              <option value="韩国">涉及韩国始发到中国的航程</option>
               <option value="特别旅客">涉及会员,留学生,劳务等的航程</option>
       </select><br/>
           仓位类型：<select name="Carbin">
         <option value="头等舱">头等舱</option>
          <option value="公务舱">公务舱</option>
           <option value="经济舱">经济舱</option>
            <option value="儿童">儿童</option>
             <option value="明珠经济舱">明珠经济舱</option>
              <option value="南航明珠金卡会员">南航明珠金卡会员</option>
               <option value="天合联盟超级精英">天合联盟超级精英</option>
               <option value="南航明珠银卡会员">南航明珠银卡会员</option>
              <option value="天合联盟精英">天合联盟精英</option>
               <option value="留学生">留学生</option>
                <option value="劳务">劳务</option>
               <option value="海员">海员</option>
       </select><br/>
      <!--   仓位类型：<input type="text" name="Carbin" placeholder="Carbin" required="" autocomplete="off"><br/>-->
       行李重量：<input type="text" name="LuggageWeight" placeholder="LuggageWeight" required="" autocomplete="off"><br/>
       行李数量：<input type="text" name="Luggageamount" placeholder="Luggageamount" required="" autocomplete="off"><br/>
       行李长度：<input type="text" name="Length" placeholder="Length" required="" autocomplete="off"><br/>
       行李宽度：<input type="text" name="Width" placeholder="Width" required="" autocomplete="off"><br/>
        行李高度：<input type="text" name="Height" placeholder="Height" required="" autocomplete="off"><br/> 
  <input type="submit" value="提交"/> 
</form>
</body>
</html>