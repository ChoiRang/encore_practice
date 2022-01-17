<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
    <title>>할 일 목 록</title>

    <!-- 부트스트랩 -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<style type="text/css">

	</style>
	<script type="text/javascript"></script>
  </head>
  <body>
 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">Navbar</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="#">Home</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Link</a>
	        </li>
	        <li class="nav-item dropdown">
	          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
	            Dropdown
	          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
	            <li><a class="dropdown-item" href="#">Action</a></li>
	            <li><a class="dropdown-item" href="#">Another action</a></li>
	            <li><hr class="dropdown-divider"></li>
	            <li><a class="dropdown-item" href="#">Something else here</a></li>
	          </ul>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link disabled">Disabled</a>
	        </li>
	      </ul>
	      <form class="d-flex">
	        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
	        <button class="btn btn-outline-success" type="submit">Search</button>
	      </form>
	    </div>
	  </div>
	</nav>
  	
  	<div class="container">
  		<div class="row">
  			<div class="col-md-2">
  				
  				<div class="accordion" id="accordionExample">
				  <div class="accordion-item">
				    <h2 class="accordion-header" id="headingOne">
				      <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
				        user information
				      </button>
				    </h2>
				    <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
				      <div class="accordion-body">
				        <strong>This is the first item's accordion body.</strong>
				      </div>
				    </div>
				  </div>
				  <div class="accordion-item">
				    <h2 class="accordion-header" id="headingTwo">
				      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
				        Accordion Item #2
				      </button>
				    </h2>
				    <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
				      <div class="accordion-body">
				        <strong>This is the second item's accordion body.</strong>
				      </div>
				    </div>
				  </div>
				  <div class="accordion-item">
				    <h2 class="accordion-header" id="headingThree">
				      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
				        Accordion Item #3
				      </button>
				    </h2>
				    <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#accordionExample">
				      <div class="accordion-body">
				        <strong>This is the third item's accordion body.</strong>
				      </div>
				    </div>
				  </div>
				</div>
  				
  				
  			</div>
  			<div class="col-md-10">
  			
	    <h1>할 일 목 록</h1>
	    <a href="insert_form">글 등 록</a>
		<p>저장갯수: ${todo_count}</p>
	    <table class="table table-striped table-hover">
		  <tr>
		    <th class="col-md-2">번호</th>
		    <th class="col-md-5">제목</th>
		    <th></th>
		  </tr>
		  <c:forEach items="${todo_list}" var="todo">
		  <tr>
		    <td>${todo.no}</td>
		    <td><a href="detail?no=${todo.no}&pno=${param.pno}">${todo.title}</a></td>
			<td>
				<div class="btn-group">
					<button type="button" class="btn btn-info">Action</button>
					<button type="button" class="btn btn-info dropdown-toggle dropdown-toggle-split" data-bs-toggle="dropdown" aria-expanded="false">
				    	<span class="visually-hidden">To</span>
				  	</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
					    <li><a class="dropdown-item" href="#">Modify</a></li>
					    <li><a class="dropdown-item" href="#">Delete</a></li>
					    <li><hr class="dropdown-divider"></li>
					    <li><a class="dropdown-item" href="#">Add commmet</a></li>
					</ul>
				</div>
			</td>
		  </tr>
		  </c:forEach>
		</table>
		
		<nav>
		  <ul class="pagination">
		    <li class="page-item">
				<c:if test="${pageNavi[0] != 1}">
					<a class="page-link" href="list?pno=${pageNavi[0]-1}" aria-label="Previous"></a>
		    		<span aria-hidden="true">&laquo;</span>
				</c:if>
		    </li>
			<c:forEach items="${pageNavi}" var="pageNo">
				<li class="page-item ${param.pno == pageNo ? 'active' : '' }">
					<a class="page-link" href="list?pno=${pageNo}">${pageNo}</a>
				</li>
			</c:forEach>
			<li class="page-item">
				<c:if test="${pageNavi[pageNavi.size()-1] != 1}">
					<a class="page-link" href="list?pno=${pageNavi[pafeNavi.size()-1]+1}" aria-label="Next">
			        <span aria-hidden="true">&raquo;</span></a>
				</c:if>
			</li>				
		  </ul>
		</nav>
		<hr>
		<div id="search">
			<form action="search" class="form-inline">
				<div class="form-group">
					<label>검색대상</label>
					<select name="target" id="search_target" class="form-control">
						<option value="title">제 목</option>
						<option value="todo">내 용</option>
					</select>
				</div>
				<div class="form-group">
					<label>검색어</label>
					<input name="word" class="form-control">
				</div>
				<button type="submit" class="btn btn-primary">search</button>
			</form>
		</div>
  	</div>
  	</div>
 	</div>
  </body>
</html>
