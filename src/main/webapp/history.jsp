<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <style>
            div {
                height: 40px;
            }
            div a {
                padding: 0 10px 0 5px;
                border-right: 1px solid #000;
            }
            div a:last-child {
                border: 0;
            }
            table {
                width: 100%;
            }

            table thead tr th {
                background-color: mediumseagreen;
                border-right: 1px solid #fff;
                color: #fff;
                padding: 10px 0;
            }
        </style>
        <title>와이파이 정보 구하기</title>
    </head>
    <body>
        <h1>와이파이 정보 구하기</h1>

        <div>
            <a href="index.jsp">홈</a>
            <a href="history.jsp">위치 히스토리 목록</a>
            <a href="load-wifi.jsp">Open API 와이파이 정보 가져오기</a>
        </div>

        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>X좌표</th>
                    <th>Y좌표</th>
                    <th>조회일자</th>
                    <th>비고</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>2</td>
                    <td>3</td>
                    <td>4</td>
                    <td>
                        <button type="button">삭제</button>
                    </td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
