package com.cicdlectures.menuserver.service;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

import com.cicdlectures.menuserver.dto.MenuDto;
import com.cicdlectures.menuserver.dto.DishDto;
import com.cicdlectures.menuserver.model.Menu;
import com.cicdlectures.menuserver.model.Dish;
import com.cicdlectures.menuserver.repository.MenuRepository;
import com.cicdlectures.menuserver.repository.DishRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListMenuServiceTests {

  private ListMenuService subject;
  private MenuRepository menuRepository;
  
  @BeforeEach
  public void init() {
    this.menuRepository = mock(MenuRepository.class);
    this.subject = new ListMenuService(this.menuRepository);
  }
  
  @Test
  @DisplayName("lists all known menus")
  public void listsKnownMenus() {
    when(menuRepository.findAll()).thenReturn(null);
  }
}
