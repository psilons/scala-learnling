package org.mytest.utapp

import org.scalatest.funsuite.AnyFunSuite
import org.mockito.Mockito.when
import org.scalatestplus.mockito.MockitoSugar

class MySimpleServiceTest extends AnyFunSuite with MockitoSugar {
    val svc = new MySimpleService()

    test("should return 5") {
        assert(svc.plus(2, 3) == 5)
    }

    test("should return 6") {
        val mockSvc = mock[MySimpleService]
        when(mockSvc.plus(2, 3)) thenReturn 2 * 3
        assert(mockSvc.plus(2, 3) == 6)
    }
}
