<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <jsp:include page="../template/_metaStyle.jsp"/>
    <title>База знаний></title>

</head>
<body class="" style="background-color: rgba(205,219,245,0.39)">
<jsp:include page="../template/_menu.jsp"/>
<style>
    p {
        text-indent: 2.25em;
        text-align: justify;
    }
</style>

<div class="card m-auto col-md-10 order-md-1">
    <div class="d-flex align-items-start">
        <div class="flex-shrink-0 p-3 bg-white" style="width: 280px;">
            <a href="${pageContext.request.contextPath}/analytic"
               class="d-flex align-items-center pb-3 mb-3 link-dark text-decoration-none border-bottom">
                <svg class="bi me-2" width="30" height="24">
                    <use xlink:href="#bootstrap"></use>
                </svg>
                <span class="fs-5 fw-semibold">Сверки</span>
            </a>
            <ul class="list-unstyled ps-0">
                <core:forEach items="${isList}" var="is">
                    <li class="mb-1">
                        <button class="btn btn-toggle align-items-center rounded collapsed" data-bs-toggle="collapse"
                                data-bs-target="#${is.name}-collapse" aria-expanded="false">
                                ${is.description}
                        </button>
                        <div class="collapse" id="${is.name}-collapse">
                            <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                <core:forEach items="${is.analyticalReports}" var="reportList">
                                    <li><a href="${pageContext.request.contextPath}/analytic?page=${reportList.name}"
                                           class="link-dark rounded">${reportList.title}</a></li>
                                </core:forEach>
                            </ul>
                        </div>
                    </li>
                </core:forEach>
            </ul>
        </div>
        <div class="b-example-divider"></div>
        <div class="tab-content col-lg m" id="v-pills-tabContent">
            <div class="p-5 mb-4 bg-light rounded-3">
                <core:choose>
                    <core:when test="${report == null}">
                        <h1 class="text-center">Сверки</h1>
                        <p>В данном разделе представлены сверки по централизованым, оперативно-справочным и иным учетам,
                            находязимся в компетенции ИЦ ГУ МВД России</p> </core:when>
                    <core:otherwise>
                        <h1 class="border-bottom border-3 border-dark mb-lg-3">${report.title}</h1>
                        <p><b>Описание:</b> ${report.description}</p>
                        <p><b>Цель:</b> ${report.goal}</p>
                        <p><b>Алгоритм:</b> ${report.algorithm}</p>
                        <p><b>Дополнительные фильтры:</b> ${report.filter}</p>
                        <p><b>Периодичность:</b> ${report.updateFrequency}</p>
                        <div class="card border-dark">
                            <label class="px-1"><b>SQL:</b></label><code class="m-1">${report.selectQuery}</code>
                        </div>
                        <p>${report.notes}</p>
                    </core:otherwise>
                </core:choose>
            </div>
        </div>
    </div>


</div>


<jsp:include page="../template/_footer.jsp"/>
</body>
</html>

