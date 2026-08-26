use crate::Solvable;

const P011_DATA: &str = include_str!("p011.txt");

fn grid_product(grid: &[Vec<i64>], i: usize, j: usize, count: usize) -> i64 {
    let n = grid.len();
    let mut max = 1i64;

    if i + count <= n {
        let p: i64 = (0..count).map(|k| grid[j][i + k]).product();
        if p > max { max = p; }
    }
    if j + count <= n {
        let p: i64 = (0..count).map(|k| grid[j + k][i]).product();
        if p > max { max = p; }
    }
    if i + count <= n && j + count <= n {
        let p: i64 = (0..count).map(|k| grid[j + k][i + k]).product();
        if p > max { max = p; }
    }
    if i + count <= n && j >= count - 1 {
        let p: i64 = (0..count).map(|k| grid[j - k][i + k]).product();
        if p > max { max = p; }
    }
    max
}

pub struct P011;
impl Solvable for P011 {
    fn problem_name(&self) -> &str { "p011" }
    fn solve(&self) -> i64 {
        let grid: Vec<Vec<i64>> = P011_DATA.trim().lines().map(|line| {
            line.split_whitespace().map(|n| n.parse().unwrap()).collect()
        }).collect();
        let n = grid.len();
        let count = 4;
        let mut max = 1i64;
        for i in 0..n {
            for j in 0..n {
                let p = grid_product(&grid, i, j, count);
                if p > max { max = p; }
            }
        }
        max
    }
}
